package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass682 {

    @Ignore    private SampleClass683 sampleClass;

    public SampleClass682(){
        sampleClass = new SampleClass683();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}