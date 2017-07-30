package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass653 {

    @Ignore    private SampleClass654 sampleClass;

    public SampleClass653(){
        sampleClass = new SampleClass654();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}