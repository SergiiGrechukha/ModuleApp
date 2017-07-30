package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1204 {

    @Ignore    private SampleClass1205 sampleClass;

    public SampleClass1204(){
        sampleClass = new SampleClass1205();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}