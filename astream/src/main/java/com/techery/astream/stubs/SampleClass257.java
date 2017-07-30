package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass257 {

    @Ignore    private SampleClass258 sampleClass;

    public SampleClass257(){
        sampleClass = new SampleClass258();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}