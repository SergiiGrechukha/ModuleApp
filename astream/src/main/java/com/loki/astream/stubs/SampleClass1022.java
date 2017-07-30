package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1022 {

    @Ignore    private SampleClass1023 sampleClass;

    public SampleClass1022(){
        sampleClass = new SampleClass1023();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}