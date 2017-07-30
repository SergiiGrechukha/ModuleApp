package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1620 {

    @Ignore    private SampleClass1621 sampleClass;

    public SampleClass1620(){
        sampleClass = new SampleClass1621();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}