package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass454 {

    @Ignore    private SampleClass455 sampleClass;

    public SampleClass454(){
        sampleClass = new SampleClass455();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}