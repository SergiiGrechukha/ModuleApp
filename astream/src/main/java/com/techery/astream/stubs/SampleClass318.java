package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass318 {

    @Ignore    private SampleClass319 sampleClass;

    public SampleClass318(){
        sampleClass = new SampleClass319();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}