package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass353 {

    @Ignore    private SampleClass354 sampleClass;

    public SampleClass353(){
        sampleClass = new SampleClass354();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}