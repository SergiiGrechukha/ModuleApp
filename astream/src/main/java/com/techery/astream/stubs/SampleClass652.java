package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass652 {

    @Ignore    private SampleClass653 sampleClass;

    public SampleClass652(){
        sampleClass = new SampleClass653();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}