package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1142 {

    @Ignore    private SampleClass1143 sampleClass;

    public SampleClass1142(){
        sampleClass = new SampleClass1143();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}