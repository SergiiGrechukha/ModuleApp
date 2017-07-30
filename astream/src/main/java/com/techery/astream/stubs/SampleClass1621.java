package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1621 {

    @Ignore    private SampleClass1622 sampleClass;

    public SampleClass1621(){
        sampleClass = new SampleClass1622();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}