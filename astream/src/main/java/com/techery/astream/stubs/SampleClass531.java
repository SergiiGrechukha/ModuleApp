package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass531 {

    @Ignore    private SampleClass532 sampleClass;

    public SampleClass531(){
        sampleClass = new SampleClass532();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}