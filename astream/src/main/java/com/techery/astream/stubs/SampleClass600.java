package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass600 {

    @Ignore    private SampleClass601 sampleClass;

    public SampleClass600(){
        sampleClass = new SampleClass601();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}