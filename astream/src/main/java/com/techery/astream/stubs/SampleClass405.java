package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass405 {

    @Ignore    private SampleClass406 sampleClass;

    public SampleClass405(){
        sampleClass = new SampleClass406();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}