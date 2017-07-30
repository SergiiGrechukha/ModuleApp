package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass206 {

    @Ignore    private SampleClass207 sampleClass;

    public SampleClass206(){
        sampleClass = new SampleClass207();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}