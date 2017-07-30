package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass356 {

    @Ignore    private SampleClass357 sampleClass;

    public SampleClass356(){
        sampleClass = new SampleClass357();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}