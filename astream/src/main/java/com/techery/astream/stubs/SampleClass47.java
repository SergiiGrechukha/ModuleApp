package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass47 {

    @Ignore    private SampleClass48 sampleClass;

    public SampleClass47(){
        sampleClass = new SampleClass48();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}