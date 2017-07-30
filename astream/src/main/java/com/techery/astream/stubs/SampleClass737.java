package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass737 {

    @Ignore    private SampleClass738 sampleClass;

    public SampleClass737(){
        sampleClass = new SampleClass738();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}