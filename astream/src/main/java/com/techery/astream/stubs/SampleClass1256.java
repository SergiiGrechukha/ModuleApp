package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1256 {

    @Ignore    private SampleClass1257 sampleClass;

    public SampleClass1256(){
        sampleClass = new SampleClass1257();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}