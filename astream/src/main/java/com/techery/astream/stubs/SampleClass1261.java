package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1261 {

    @Ignore    private SampleClass1262 sampleClass;

    public SampleClass1261(){
        sampleClass = new SampleClass1262();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}