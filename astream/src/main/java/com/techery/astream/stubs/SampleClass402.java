package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass402 {

    @Ignore    private SampleClass403 sampleClass;

    public SampleClass402(){
        sampleClass = new SampleClass403();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}