package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass586 {

    @Ignore    private SampleClass587 sampleClass;

    public SampleClass586(){
        sampleClass = new SampleClass587();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}