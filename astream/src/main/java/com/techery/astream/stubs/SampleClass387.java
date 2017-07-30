package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass387 {

    @Ignore    private SampleClass388 sampleClass;

    public SampleClass387(){
        sampleClass = new SampleClass388();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}