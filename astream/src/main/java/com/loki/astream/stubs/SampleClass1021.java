package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1021 {

    @Ignore    private SampleClass1022 sampleClass;

    public SampleClass1021(){
        sampleClass = new SampleClass1022();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}