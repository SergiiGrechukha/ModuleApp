package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass883 {

    @Ignore    private SampleClass884 sampleClass;

    public SampleClass883(){
        sampleClass = new SampleClass884();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}