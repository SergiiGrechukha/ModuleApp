package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1284 {

    @Ignore    private SampleClass1285 sampleClass;

    public SampleClass1284(){
        sampleClass = new SampleClass1285();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}