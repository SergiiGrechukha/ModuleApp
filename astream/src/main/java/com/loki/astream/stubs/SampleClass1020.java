package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1020 {

    @Ignore    private SampleClass1021 sampleClass;

    public SampleClass1020(){
        sampleClass = new SampleClass1021();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}