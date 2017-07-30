package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass278 {

    @Ignore    private SampleClass279 sampleClass;

    public SampleClass278(){
        sampleClass = new SampleClass279();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}