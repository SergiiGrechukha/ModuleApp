package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass360 {

    @Ignore    private SampleClass361 sampleClass;

    public SampleClass360(){
        sampleClass = new SampleClass361();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}