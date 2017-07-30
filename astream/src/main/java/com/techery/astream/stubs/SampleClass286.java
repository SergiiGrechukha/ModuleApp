package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass286 {

    @Ignore    private SampleClass287 sampleClass;

    public SampleClass286(){
        sampleClass = new SampleClass287();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}