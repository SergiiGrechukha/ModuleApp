package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1664 {

    @Ignore    private SampleClass1665 sampleClass;

    public SampleClass1664(){
        sampleClass = new SampleClass1665();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}