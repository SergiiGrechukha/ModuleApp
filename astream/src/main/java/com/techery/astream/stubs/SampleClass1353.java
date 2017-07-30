package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1353 {

    @Ignore    private SampleClass1354 sampleClass;

    public SampleClass1353(){
        sampleClass = new SampleClass1354();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}