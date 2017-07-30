package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1903 {

    @Ignore    private SampleClass1904 sampleClass;

    public SampleClass1903(){
        sampleClass = new SampleClass1904();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}