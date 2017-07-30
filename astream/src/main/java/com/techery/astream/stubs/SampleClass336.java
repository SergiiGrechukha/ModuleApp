package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass336 {

    @Ignore    private SampleClass337 sampleClass;

    public SampleClass336(){
        sampleClass = new SampleClass337();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}