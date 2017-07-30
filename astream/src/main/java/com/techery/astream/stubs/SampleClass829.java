package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass829 {

    @Ignore    private SampleClass830 sampleClass;

    public SampleClass829(){
        sampleClass = new SampleClass830();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}