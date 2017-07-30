package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass918 {

    @Ignore    private SampleClass919 sampleClass;

    public SampleClass918(){
        sampleClass = new SampleClass919();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}