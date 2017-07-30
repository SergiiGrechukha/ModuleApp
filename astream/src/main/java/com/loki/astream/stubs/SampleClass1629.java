package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1629 {

    @Ignore    private SampleClass1630 sampleClass;

    public SampleClass1629(){
        sampleClass = new SampleClass1630();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}