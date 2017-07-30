package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass610 {

    @Ignore    private SampleClass611 sampleClass;

    public SampleClass610(){
        sampleClass = new SampleClass611();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}