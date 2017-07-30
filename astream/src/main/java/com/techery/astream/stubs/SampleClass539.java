package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass539 {

    @Ignore    private SampleClass540 sampleClass;

    public SampleClass539(){
        sampleClass = new SampleClass540();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}