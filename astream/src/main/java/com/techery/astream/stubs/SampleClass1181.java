package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1181 {

    @Ignore    private SampleClass1182 sampleClass;

    public SampleClass1181(){
        sampleClass = new SampleClass1182();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}