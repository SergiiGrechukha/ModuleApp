package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1203 {

    @Ignore    private SampleClass1204 sampleClass;

    public SampleClass1203(){
        sampleClass = new SampleClass1204();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}