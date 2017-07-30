package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1817 {

    @Ignore    private SampleClass1818 sampleClass;

    public SampleClass1817(){
        sampleClass = new SampleClass1818();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}