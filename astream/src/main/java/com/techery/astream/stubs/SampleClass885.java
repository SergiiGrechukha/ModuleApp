package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass885 {

    @Ignore    private SampleClass886 sampleClass;

    public SampleClass885(){
        sampleClass = new SampleClass886();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}